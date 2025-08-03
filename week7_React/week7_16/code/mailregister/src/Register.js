import React, { useState } from 'react';

function Register() {
  const [formData, setFormData] = useState({
    name: '',
    email: '',
    password: '',
  });

  const [errors, setErrors] = useState({});

  // 🔄 Handle Input Changes
  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData((prev) => ({
      ...prev,
      [name]: value,
    }));
  };

  // ✅ Handle Form Submit
  const handleSubmit = (e) => {
    e.preventDefault();

    const newErrors = {};

    if (formData.name.length < 5) {
      newErrors.name = 'Name should be at least 5 characters.';
    }

    if (!formData.email.includes('@') || !formData.email.includes('.')) {
      newErrors.email = 'Email must include @ and .';
    }

    if (formData.password.length < 8) {
      newErrors.password = 'Password must be at least 8 characters.';
    }

    setErrors(newErrors);

    if (Object.keys(newErrors).length === 0) {
      alert('Registration successful!');
      setFormData({ name: '', email: '', password: '' });
    }
  };

  return (
    <form onSubmit={handleSubmit} style={{ width: '400px', margin: 'auto' }}>
      <div style={{ marginBottom: '10px' }}>
        <label>Name:</label><br />
        <input
          type="text"
          name="name"
          value={formData.name}
          onChange={handleChange}
        />
        {errors.name && <div style={{ color: 'red' }}>{errors.name}</div>}
      </div>

      <div style={{ marginBottom: '10px' }}>
        <label>Email:</label><br />
        <input
          type="text"
          name="email"
          value={formData.email}
          onChange={handleChange}
        />
        {errors.email && <div style={{ color: 'red' }}>{errors.email}</div>}
      </div>

      <div style={{ marginBottom: '10px' }}>
        <label>Password:</label><br />
        <input
          type="password"
          name="password"
          value={formData.password}
          onChange={handleChange}
        />
        {errors.password && <div style={{ color: 'red' }}>{errors.password}</div>}
      </div>

      <button type="submit">Register</button>
    </form>
  );
}

export default Register;