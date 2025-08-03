import React from 'react';

const books = [
  { id: 101, bname: 'Master React', price: 1000 },
  { id: 102, bname: 'Deep Dive into Angular 11', price: 900 },
  { id: 103, bname: 'Mongo Essentials', price: 450 }
];

function BookDetails() {
  return (
    <div className="section">
      <h2>Book Details</h2>
      {books.map(book => (
        <div key={book.id}>
          <h3>{book.bname}</h3>
          <h4>{book.price}</h4>
        </div>
      ))}
    </div>
  );
}

export default BookDetails;
