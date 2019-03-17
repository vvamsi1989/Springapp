import React, { Component } from "react";
import ProjectItem from "./project/ProjectItem";
import Header from "./layout/Header";
class Dashboard extends Component {
  render() {
    return (
      <div>
        <Header />
        <h1>Welcome to the Dashboard of PPM Tool</h1>
        <ProjectItem />
      </div>
    );
  }
}

export default Dashboard;
