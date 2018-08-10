<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <title>Bill Invoice</title>
    
    <style>
    .invoice-box {
        max-width: 800px;
        margin: auto;
        padding: 30px;
        border: 1px solid #eee;
        box-shadow: 0 0 10px rgba(0, 0, 0, .15);
        font-size: 16px;
        line-height: 24px;
        font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif;
        color: #555;
    }
    
    .invoice-box table {
        width: 100%;
        line-height: inherit;
        text-align: left;
    }
    
    .invoice-box table td {
        padding: 5px;
        vertical-align: top;
    }
    
    .invoice-box table tr td:nth-child(2) {
        text-align: right;
    }
    
    .invoice-box table tr.top table td {
        padding-bottom: 20px;
    }
    
    .invoice-box table tr.top table td.title {
        font-size: 45px;
        line-height: 45px;
        color: #333;
    }
    
    .invoice-box table tr.information table td {
        padding-bottom: 40px;
    }
    
    .invoice-box table tr.heading td {
        background: #eee;
        border-bottom: 1px solid #ddd;
        font-weight: bold;
    }
    
    .invoice-box table tr.details td {
        padding-bottom: 20px;
    }
    
    .invoice-box table tr.item td{
        border-bottom: 1px solid #eee;
    }
    
    .invoice-box table tr.item.last td {
        border-bottom: none;
    }
    
    .invoice-box table tr.total td:nth-child(2) {
        border-top: 2px solid #eee;
        font-weight: bold;
    }
    
    @media only screen and (max-width: 600px) {
        .invoice-box table tr.top table td {
            width: 100%;
            display: block;
            text-align: center;
        }
        
        .invoice-box table tr.information table td {
            width: 100%;
            display: block;
            text-align: center;
        }
    }
    
    /** RTL **/
    .rtl {
        direction: rtl;
        font-family: Tahoma, 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif;
    }
    
    .rtl table {
        text-align: right;
    }
    
    .rtl table tr td:nth-child(2) {
        text-align: left;
    }
    </style>
</head>

<body>
    <div class="invoice-box">
        <table cellpadding="0" cellspacing="0">
            <tr class="top">
                <td colspan="2">
                    <table>
                        <tr>
                            <td class="title">
                                <!-- <img src="https://healthygourmetmiami.com/wp-content/uploads/2017/07/gourmet-catering-1.jpg" style="width:100%; max-width:300px;"> -->
								<img src="http://www.frosch.com/home/wp-content/uploads/2016/06/xAA-Launches-Gourmet-Food-Options.png.pagespeed.ic.zKfJ62NJPI.jpg" style="width:100%; max-width:400px;">
                            </td>
                            
                            <td>
                                Invoice #: 1<br>
                                Created: <script>
											var today = new Date();
											var dd = today.getDate();
											var mm = today.getMonth()+1; //January is 0!
											var yyyy = today.getFullYear();

											if(dd<10) {
												dd = '0'+dd
											} 

											if(mm<10) {
												mm = '0'+mm
											} 

											today = dd + '/' + mm + '/' + yyyy;
											document.write(today);
										</script><br>
									<script>
										function updateTime() {
										var currentTime = new Date();
										var hours = currentTime.getHours();
										var minutes = currentTime.getMinutes();
										var seconds = currentTime.getSeconds();
										if (minutes < 10){
											minutes = "0" + minutes;
										}
										if (seconds < 10){
											seconds = "0" + seconds;
										}
										var v = hours + ":" + minutes + ":" + seconds + " ";
											if(hours > 11){
												v+="PM";
											} else {
												v+="AM"
											}
										setTimeout("updateTime()",1000);
										document.getElementById('time').innerHTML=v;
										}
										updateTime();
									</script>
								 Current Time: <span id="time" />
							</td>
                        </tr>
                    </table>
                </td>
            </tr>
            
            <tr class="information">
                <td colspan="2">
                    <table>
                        <tr>
                            <td>
                                Nexwave Learning Management Solution<br>
                                Plot No. 116, 4th Floor<br>
                                1st Stage, Whitefield, Bengaluru
                            </td>
                            
                            <td>
                                PH: +91 9000090000<br>
                                The Management<br>
                                management@gmail.com
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
            
            <tr class="heading">
                <td>
                    Payment Method
                </td>                
            </tr>
            
            <tr class="details">
                <td>
                   Cash On Delivery
                </td>              
            </tr>
            
            <tr class="heading">
                <td>
                    Item
                </td>
                
                <td>
                    Price
                </td>
            </tr>
            
            <tr class="item">
                <td>
                    Item 1
                </td>
                
                <td>
                    Price 1
                </td>
            </tr>
            
            <tr class="item">
                <td>
                    Item 2
                </td>
                
                <td>
                    Price 2
                </td>
            </tr>
            
            <tr class="item last">
                <td>
                    Item 3
                </td>
                
                <td>
                    Price 3
                </td>
            </tr>
            
            <tr class="total">
                <td></td>
                
                <td>
                   Total: Total1
                </td>
            </tr>
        </table>
    </div>
</body>
</html>