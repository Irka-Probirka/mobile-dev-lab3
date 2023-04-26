package com.example.lab3

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_one = findViewById<Button>(R.id.btn_one)
        val btn_two = findViewById<Button>(R.id.btn_two)
        val btn_three = findViewById<Button>(R.id.btn_three)
        val btn_four = findViewById<Button>(R.id.btn_four)
        val btn_five = findViewById<Button>(R.id.btn_five)
        val btn_six = findViewById<Button>(R.id.btn_six)
        val btn_seven = findViewById<Button>(R.id.btn_seven)
        val btn_eight = findViewById<Button>(R.id.btn_eight)
        val btn_nine = findViewById<Button>(R.id.btn_nine)
        val btn_zero = findViewById<Button>(R.id.btn_zero)

        val btn_clear = findViewById<Button>(R.id.btn_clear)
        val btn_plus_minus = findViewById<Button>(R.id.btn_plus_minus)
        val btn_percent = findViewById<Button>(R.id.btn_percent)
        val btn_dot = findViewById<Button>(R.id.btn_dot)

        val btn_plus = findViewById<Button>(R.id.btn_plus)
        val btn_minus = findViewById<Button>(R.id.btn_minus)
        val btn_multi = findViewById<Button>(R.id.btn_multi)
        val btn_div = findViewById<Button>(R.id.btn_div)
        val btn_equals = findViewById<Button>(R.id.btn_equals)

        var A: Double = 0.0;
        var B: Double = 0.0;
        var method: String = "";

        val input = findViewById<TextView>(R.id.text_write)
        input.text = "0"

        fun tryParseToInt(result: Double): String{
            if (Math.floor(result) == result)
                return result.toInt().toString();
            else
                return result.toString()
        }

        //Функции
        fun calc(){
            B = input.text.toString().toDouble()

            if (method == "plus")
                input.text = tryParseToInt(A + B)
            if (method == "minus")
                input.text = tryParseToInt(A - B)
            if (method == "multi")
                input.text = tryParseToInt(A * B)
            if (method == "div"){
                if(B == 0.0){
                    input.text = "Ошибка"
                }
                else
                    input.text = tryParseToInt(A / B)
            }

            method = ""
            A = 0.0
            B = 0.0
        }

        btn_plus.setOnClickListener(){
            if (method != ""){
                B = input.text.toString().toDouble()
                calc()
            }
            else{
                A = input.text.toString().toDouble()
                method = "plus"
            }
        }

        btn_minus.setOnClickListener(){
            if (method != ""){
                B = input.text.toString().toDouble()
                calc()
            }
            else{
                A = input.text.toString().toDouble()
                method = "minus"
            }
        }

        btn_multi.setOnClickListener(){
            if (method != ""){
                B = input.text.toString().toDouble()
                calc()
            }
            else{
                A = input.text.toString().toDouble()
                method = "multi"
            }
        }

        btn_div.setOnClickListener(){
            if (method != ""){
                B = input.text.toString().toDouble()
                calc()
            }
            else{
                A = input.text.toString().toDouble()
                method = "div"
            }
        }

        //Специальные кнопки
        btn_clear.setOnClickListener(){
            method = ""
            A = 0.0
            B = 0.0
            input.text = "0"
        }

        btn_plus_minus.setOnClickListener(){
            val index: Int = input.text.indexOf("-")
            if (index == -1) input.text = "-" + input.text.toString()
            else input.text = input.text.replaceFirst("^.".toRegex(), "")
        }

        btn_percent.setOnClickListener(){
            input.text = (input.text.toString().toDouble() / 100).toString()
        }

        btn_equals.setOnClickListener(){
            calc()
        }

        //Точка
        btn_dot.setOnClickListener(){
            val index: Int = input.text.indexOf(".")
            if (index == -1) input.text = input.text.toString() + "."
        }

        //Цифры
        btn_one.setOnClickListener(){
            if (method != "" || input.text.length < 1){
                input.text = "1"
            }
            else {
                if (input.text == "0" || input.text == "Ошибка")
                    input.text = "1"
                else
                    input.text = input.text.toString() + "1"
            }
        }

        btn_two.setOnClickListener(){
            if (method != "" || input.text.length < 1){
                input.text = "2"
            }
            else {
                if (input.text == "0" || input.text == "Ошибка")
                    input.text = "2"
                else
                    input.text = input.text.toString() + "2"
            }
        }

        btn_three.setOnClickListener(){
            if (method != "" || input.text.length < 1){
                input.text = "3"
            }
            else {
                if (input.text == "0" || input.text == "Ошибка")
                    input.text = "3"
                else
                    input.text = input.text.toString() + "3"
            }
        }

        btn_four.setOnClickListener(){
            if (method != "" || input.text.length < 1){
                input.text = "4"
            }
            else {
                if (input.text == "0" || input.text == "Ошибка")
                    input.text = "4"
                else
                    input.text = input.text.toString() + "4"
            }
        }

        btn_five.setOnClickListener(){
            if (method != "" || input.text.length < 1){
                input.text = "5"
            }
            else {
                if (input.text == "0" || input.text == "Ошибка")
                    input.text = "5"
                else
                    input.text = input.text.toString() + "5"
            }
        }

        btn_six.setOnClickListener(){
            if (method != "" || input.text.length < 1){
                input.text = "6"
            }
            else {
                if (input.text == "0" || input.text == "Ошибка")
                    input.text = "6"
                else
                    input.text = input.text.toString() + "6"
            }
        }

        btn_seven.setOnClickListener(){
            if (method != "" || input.text.length < 1){
                input.text = "7"
            }
            else {
                if (input.text == "0" || input.text == "Ошибка")
                    input.text = "7"
                else
                    input.text = input.text.toString() + "7"
            }
        }

        btn_eight.setOnClickListener(){
            if (method != "" || input.text.length < 1){
                input.text = "8"
            }
            else {
                if (input.text == "0" || input.text == "Ошибка")
                    input.text = "8"
                else
                    input.text = input.text.toString() + "8"
            }
        }

        btn_nine.setOnClickListener(){
            if (method != "" || input.text.length < 1){
                input.text = "9"
            }
            else {
                if (input.text == "0" || input.text == "Ошибка")
                    input.text = "9"
                else
                    input.text = input.text.toString() + "9"
            }
        }

        btn_zero.setOnClickListener(){
            if (method != "" || input.text.length < 1){
                input.text = "0"
            }
            else {
                if (input.text == "0" || input.text == "Ошибка")
                    input.text = "0"
                else
                    input.text = input.text.toString() + "0"
            }
        }
    }
}