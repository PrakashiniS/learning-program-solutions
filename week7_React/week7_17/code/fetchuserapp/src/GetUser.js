import React from "react";

class Getuser extends React.Component {
  constructor() {
    super();
    this.state = {
      title: "",
      firstname: "",
      image: "",
      loading: true,
    };
  }

  async componentDidMount() {
    try {
      const response = await fetch("https://api.randomuser.me/");
      const data = await response.json();
      const user = data.results[0];
      this.setState({
        title: user.name.title,
        firstname: user.name.first,
        image: user.picture.large,
        loading: false,
      });
    } catch (error) {
      console.error("Error fetching user:", error);
    }
  }

  render() {
    const { title, firstname, image, loading } = this.state;

    return (
      <div style={{ textAlign: "center", marginTop: "50px" }}>
        {loading ? (
          <h3>Loading...</h3>
        ) : (
          <div>
            <h2>
              {title} {firstname}
            </h2>
            <img src={image} alt="user" style={{ borderRadius: "50%" }} />
          </div>
        )}
      </div>
    );
  }
}

export default Getuser;