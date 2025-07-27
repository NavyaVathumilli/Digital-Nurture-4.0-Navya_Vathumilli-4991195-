import React from 'react';  

class Post {
  constructor(id, title, body) {
    this.id = id;
    this.title = title;
    this.body = body;
  }
}

class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      error: null
    };
  }

  loadPosts() {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(response => {
        if (!response.ok) throw new Error('Network response was not ok');
        return response.json();
      })
      .then(data => {
        const postList = data.map(p => new Post(p.id, p.title, p.body));
        this.setState({ posts: postList });
      })
      .catch(error => {
        this.setState({ error });
      });
  }

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, info) {
    alert('An error occurred: ' + error.message);
  }

  render() {
    const { posts, error } = this.state;

    if (error) {
      return <h3>Error loading posts.</h3>;
    }

    return (
      <div>
        <h1>Posts</h1>
        {posts.map(post => (
          <div key={post.id}>
            <h2>{post.title}</h2>
            <p>{post.body}</p>
            <hr />
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;

