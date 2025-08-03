import React from 'react';

const courses = [
  { cname: 'Angular', date: '4/5/2021' },
  { cname: 'React', date: '6/3/2021' }
];

function CourseDetails() {
  return (
    <div className="section">
      <h2>Course Details</h2>
      {courses.map((course, index) => (
        <div key={index}>
          <h3>{course.cname}</h3>
          <h4>{course.date}</h4>
        </div>
      ))}
    </div>
  );
}

export default CourseDetails;
