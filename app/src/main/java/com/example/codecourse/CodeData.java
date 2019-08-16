package com.example.codecourse;

import java.util.ArrayList;

public class CodeData {
    public static String[][] data = new String[][]{
            {
                "1",
                "Hypertext Markup Language",
                "Hypertext Markup Language (HTML) is the standard markup language for documents designed to be displayed in a web browser. It can be assisted by technologies such as Cascading Style Sheets (CSS) and scripting languages such as JavaScript. ",
                "https://img.icons8.com/color/144/000000/html-5.png"
            },
            {
                "2",
                "Cascading Style Sheet",
                "Cascading Style Sheets (CSS) is a style sheet language used for describing the presentation of a document written in a markup language like HTML.[1] CSS is a cornerstone technology of the World Wide Web, alongside HTML and JavaScript.",
                "https://img.icons8.com/color/144/000000/css3.png"
            },
            {
                "3",
                "Javascript",
                "Cascading Style Sheets (CSS) is a style sheet language used for describing the presentation of a document written in a markup language like HTML.[1] CSS is a cornerstone technology of the World Wide Web, alongside HTML and JavaScript.",
                "https://img.icons8.com/color/144/000000/javascript.png"
            },
            {
                "4",
                "PHP",
                "Hypertext Markup Language (HTML) is the standard markup language for documents designed to be displayed in a web browser. It can be assisted by technologies such as Cascading Style Sheets (CSS) and scripting languages such as JavaScript. ",
                "https://img.icons8.com/officel/160/000000/php-logo.png"
            },
            {
                    "2",
                    "Cascading Style Sheet",
                    "Cascading Style Sheets (CSS) is a style sheet language used for describing the presentation of a document written in a markup language like HTML.[1] CSS is a cornerstone technology of the World Wide Web, alongside HTML and JavaScript.",
                    "https://img.icons8.com/color/144/000000/css3.png"
            },
            {
                    "3",
                    "Javascript",
                    "Cascading Style Sheets (CSS) is a style sheet language used for describing the presentation of a document written in a markup language like HTML.[1] CSS is a cornerstone technology of the World Wide Web, alongside HTML and JavaScript.",
                    "https://img.icons8.com/color/144/000000/javascript.png"
            },
            {
                    "1",
                    "Hypertext Markup Language",
                    "Hypertext Markup Language (HTML) is the standard markup language for documents designed to be displayed in a web browser. It can be assisted by technologies such as Cascading Style Sheets (CSS) and scripting languages such as JavaScript. ",
                    "https://img.icons8.com/color/144/000000/html-5.png"
            },
            {
                    "2",
                    "Cascading Style Sheet",
                    "Cascading Style Sheets (CSS) is a style sheet language used for describing the presentation of a document written in a markup language like HTML.[1] CSS is a cornerstone technology of the World Wide Web, alongside HTML and JavaScript.",
                    "https://img.icons8.com/color/144/000000/css3.png"
            },
            {
                    "3",
                    "Javascript",
                    "Cascading Style Sheets (CSS) is a style sheet language used for describing the presentation of a document written in a markup language like HTML.[1] CSS is a cornerstone technology of the World Wide Web, alongside HTML and JavaScript.",
                    "https://img.icons8.com/color/144/000000/javascript.png"
            },

    };
    public static ArrayList<Code> getListData(){
        ArrayList<Code> list = new ArrayList<>();
        for (String[] aData : data) {
            Code code = new Code();
            code.setId(aData[0]);
            code.setName(aData[1]);
            code.setDetail(aData[2]);
            code.setPhoto(aData[3]);
            list.add(code);
        }
        return list;
    }
}
