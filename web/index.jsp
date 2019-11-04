<%--
  Created by IntelliJ IDEA.
  User: vietngatran
  Date: 04/11/2019
  Time: 11:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
      <h1>Product Discount Calculator</h1>
      <form method="post" action="/caculate">
        <label>Product Description</label>
        <input type="text" name="productDescription" placeholder="Product Description">
        <br/>
        <label>List Price</label>
        <input type="number" name="listPrice" placeholder="List Price">
        <br/>
        <label>Discount Percent</label>
        <input type="number" name="discountPercent" placeholder="Discount Percent">
        <br/>
        <input type="submit" value="Calculate Discount">
      </form>
  </body>
</html>
