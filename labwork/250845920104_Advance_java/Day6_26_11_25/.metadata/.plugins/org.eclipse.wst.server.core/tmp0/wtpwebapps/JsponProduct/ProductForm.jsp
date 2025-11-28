<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form action="getproduct.jsp">
<!-- PRODID    | DESCRIP                 | PRICE | qty  | PayAmount -->

    <label for="pid">Product id</label>
   <input type="number" name="productId" id="pid"><br>

   <label for="pdesc">Prduct description</label>
   <input type="text" name="desc" id="pdesc"><br>

   <label for="price">Price</label>
   <input type="number" name="price" id="price"><br>

   <label for="qty">Quantity</label>
   <input type="number" name="qty" id="qty"><br>

   <label for="pamt">Pay Amount</label>
    <input type="float" name="pamt" id="pamt"><br>


    <button value="btn" name="btn">submit</button>
    <!-- <input type="button" value="btn" name="btn"> -->
 </form>
</body>
</html>

