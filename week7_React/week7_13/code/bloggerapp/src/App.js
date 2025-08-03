import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

function App() {
  const [activeComponent, setActiveComponent] = useState("book");
  let renderedComponent;
  if (activeComponent === "book") {
    renderedComponent = <BookDetails />;
  } else if (activeComponent === "blog") {
    renderedComponent = <BlogDetails />;
  } else {
    renderedComponent = <CourseDetails />;
  }

  // Method 2: Using Ternary Operator
  // const isBook = activeComponent === "book";

  return (
    <div className="App" style={{ padding: "20px" }}>
      <h1>Blogger App</h1>

      <div style={{ marginBottom: "20px" }}>
        <button onClick={() => setActiveComponent("book")}>Show Book</button>&nbsp;
        <button onClick={() => setActiveComponent("blog")}>Show Blog</button>&nbsp;
        <button onClick={() => setActiveComponent("course")}>Show Course</button>&nbsp;
      </div>

      <div>
        {renderedComponent}

        {/*Method 2: Ternary */}
        {/* {isBook ? <BookDetails /> : <CourseDetails />} */}

        {/*  Method 3: Logical && */}
        {/* {activeComponent === "blog" && <BlogDetails />} */}
      </div>
    </div>
  );
}

export default App;