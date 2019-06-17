<html>
    <head>
        <title>Upload Profile Picture</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            body {
                background-color: black;
            }
            .bg {
                background-image: url("Assets/4070831354.png");
                height: 540px; 
                background-position: center;
                background-repeat: no-repeat;
                background-size: cover;
            }
            .Label {
                font-weight: bolder;
                font-family: Comic Sans MS, cursive, sans-serif;
                font-size: 30px;
                text-shadow: -2px 0 #424242, 0 2px #424242, 2px 0 #424242, 0 -2px #424242;
                padding: 12px 20px;
                color: white;
                text-align: center;
            }
            .label1 {
                font-family: Comic Sans MS, cursive, sans-serif;
                text-align: center;
                font-size: 25px;
                font-weight: bold;
                margin: 20px 0;
            }
            input[type=submit] {
                text-align: center;
                display: inline-block;
                position: relative;
                font-family: Comic Sans MS, cursive, sans-serif;
                font-size: 14px;
                padding: 15px 25px;
                cursor: pointer;
                margin: -28px 200px;
                position: absolute;
                -ms-transform: translate(-50%, -50%);
                transform: translate(-50%, -50%);
                color: #FFFFFF;
                background-color: #000000;
                border: outset;
            }
            input[type=file] {
                text-align: center;
                display: inline-block;
                position: relative;
                font-family: Comic Sans MS, cursive, sans-serif;
                font-size: 14px;
                padding: 15px 25px;
                cursor: pointer;
                margin: -28px 200px;
                position: absolute;
                -ms-transform: translate(-50%, -50%);
                transform: translate(-50%, -50%);
                color: #FFFFFF;
                background-color: #000000;
                border: outset;
            }
            .Upload {
                border-radius: 50%;
                background-color: #FFFFFF; 
                padding: 20px;
                margin: 20px 0;
                position: absolute;
                height: 400px;
                width: 400px;
                box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
                top: 55%;
                left: 35%;
                -ms-transform: translate(-50%, -50%);
                transform: translate(-50%, -50%);
                background: rgba(255,255,255, 0.5);
            }
            .Upload:hover {
                background: rgba(255,255,255, 0.7);
            }
        </style>
    </head>
    <body>
        <div class="Label">
            <label for="Kandle">Kandle</label>
        </div>
        <div class="bg">
            <div class="Upload">
                <div class="label1">
                    <label for="ProfilePicture">Profile Picture:</label><br><br><br><br><br>
                </div>
                <form action = "FileServlet" method = "post" enctype = "multipart/form-data">
                    <input type="file" name="file" id="file" class="inputfile" data-buttonText="Choose Profile Picture"><br><br><br><br><br>
                    <input type="submit" value="Upload">
                </form>
            </div>
        </div>
    </body>
</html>