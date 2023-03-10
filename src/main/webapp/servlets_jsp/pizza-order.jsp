<%--
  Created by IntelliJ IDEA.
  User: cantonuccio
  Date: 3/9/23
  Time: 9:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Order Pizza</title>
</head>
<body>

<form ACTION="/pizza-order" METHOD="POST">
    <label for="crust">Choose Crust Type:</label>
    <select name="crust" id="crust">
        <option value="Hand">Hand Tossed</option>
        <option value="Thin">Thin</option>
        <option value="Pan">Pan</option>
        <option value="NY">NY Style</option>
    </select>

    <br>
    <br>

    <label for="sauce">Choose Sauce Type:</label>
    <select name="sauce" id="sauce">
        <option value="Marinara">Marinara</option>
        <option value="Alfredo">Alfredo</option>
        <option value="Garlic">Garlic</option>
        <option value="None">None</option>
    </select>

    <br>
    <br>

    <label for="size">Choose Size:</label>
    <select name="size" id="size">
        <option value="Small">Small</option>
        <option value="Medium">Medium</option>
        <option value="Large">Large</option>
        <option value="XL">XLarge</option>
    </select>

    <br>
    <br>

    <p>Choose Toppings: </p>
    <label>
        <input type="checkbox" name="Cheese" value="ExtraCheese">
    </label>Extra Cheese<br>
    <label>
        <input type="checkbox" name="Mushrooms" value="Mushrooms">
    </label>Mushrooms<br>
    <label>
        <input type="checkbox" name="Bacon" value="Bacon">
    </label>Bacon<br>
    <label>
        <input type="checkbox" name="Pepperoni" value="Pepperoni">
    </label>Pepperoni<br>

    <br>
    <br>

    <label for="address">Delivery Address:</label><br>
    <input type="text" id="address" name="address"><br>

    <br>
    <br>

    <INPUT TYPE="submit" VALUE="Submit Order">

</form>


</body>
</html>
