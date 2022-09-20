package com.example.brghtest.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.brghtest.R
import java.text.DecimalFormat

class HomeFragment : Fragment() {

    private var valueOne = java.lang.Double.NaN
    private var valueTwo: Double? = null

    private val ADDITION = '+'
    private val SUBTRACTION = '-'
    private val MULTIPLICATION = '*'
    private val DIVISION = '/'
    private var CURRENT_ACTION: Char = ' '

    internal var decimalFormat = DecimalFormat("#.##########")

    private lateinit var homeViewModel: HomeViewModel
    var clearButton: Button? = null
    var addButton: Button? = null
    var minusButton: Button? = null
    var multiplyButton: Button? = null
    var divideButton: Button? = null
    var equalButton: Button? = null
    var commaButton: Button? = null
    var zeroButton: Button? = null
    var oneButton: Button? = null
    var twoButton: Button? = null
    var threeButton: Button? = null
    var fourButton: Button? = null
    var fiveButton: Button? = null
    var sixButton: Button? = null
    var sevenButton: Button? = null
    var eightButton: Button? = null
    var nineButton: Button? = null
    var calculationEditText: EditText? = null
    var resultTextView: TextView? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        clearButton = root.findViewById(R.id.buttonClear)
        addButton = root.findViewById(R.id.buttonAdd)
        minusButton = root.findViewById(R.id.buttonSubtract)
        multiplyButton = root.findViewById(R.id.buttonMultiply)
        divideButton = root.findViewById(R.id.buttonDivide)
        equalButton = root.findViewById(R.id.buttonEqual)
        commaButton = root.findViewById(R.id.buttonDot)
        zeroButton = root.findViewById(R.id.buttonZero)
        oneButton = root.findViewById(R.id.buttonOne)
        twoButton = root.findViewById(R.id.buttonTwo)
        threeButton = root.findViewById(R.id.buttonThree)
        fourButton = root.findViewById(R.id.buttonFour)
        fiveButton = root.findViewById(R.id.buttonFive)
        sixButton = root.findViewById(R.id.buttonSix)
        sevenButton = root.findViewById(R.id.buttonSeven)
        eightButton = root.findViewById(R.id.buttonEight)
        nineButton = root.findViewById(R.id.buttonNine)
        calculationEditText = root.findViewById(R.id.calculationEditText)
        resultTextView = root.findViewById(R.id.resultTextView)

        zeroButton?.setOnClickListener {
            val inputValue: String = calculationEditText?.text.toString()
            calculationEditText?.setText(inputValue + "0")
        }

        oneButton?.setOnClickListener {
            val inputValue: String = calculationEditText?.text.toString()
            calculationEditText?.setText(inputValue + "1")
        }

        twoButton?.setOnClickListener {
            val inputValue: String = calculationEditText?.text.toString()
            calculationEditText?.setText(inputValue + "2")
        }

        threeButton?.setOnClickListener {
            val inputValue: String = calculationEditText?.text.toString()
            calculationEditText?.setText(inputValue + "3")
        }

        fourButton?.setOnClickListener {
            val inputValue: String = calculationEditText?.text.toString()
            calculationEditText?.setText(inputValue + "4")
        }

        fiveButton?.setOnClickListener {
            val inputValue: String = calculationEditText?.text.toString()
            calculationEditText?.setText(inputValue + "5")
        }

        sixButton?.setOnClickListener {
            val inputValue: String = calculationEditText?.text.toString()
            calculationEditText?.setText(inputValue + "6")
        }

        sevenButton?.setOnClickListener {
            val inputValue: String = calculationEditText?.text.toString()
            calculationEditText?.setText(inputValue + "7")
        }

        eightButton?.setOnClickListener {
            val inputValue: String = calculationEditText?.text.toString()
            calculationEditText?.setText(inputValue + "8")
        }

        nineButton?.setOnClickListener {
            val inputValue: String = calculationEditText?.text.toString()
            calculationEditText?.setText(inputValue + "9")
        }

        commaButton?.setOnClickListener {
            val inputValue: String = calculationEditText?.text.toString()
            calculationEditText?.setText(inputValue + ".")
        }

        addButton?.setOnClickListener{
            computeCalculation()
            CURRENT_ACTION = ADDITION
            resultTextView?.setText(decimalFormat.format(valueOne) + "+")
            calculationEditText?.setText(null)
        }

        minusButton?.setOnClickListener {
            computeCalculation()
            CURRENT_ACTION = SUBTRACTION
            resultTextView?.setText(decimalFormat.format(valueOne) + "-")
            calculationEditText?.setText(null)
        }

        multiplyButton?.setOnClickListener{
            computeCalculation()
            CURRENT_ACTION = MULTIPLICATION
            resultTextView?.setText(decimalFormat.format(valueOne) + "*")
            calculationEditText?.setText(null)
        }

        divideButton?.setOnClickListener{
            computeCalculation()
            CURRENT_ACTION = DIVISION
            resultTextView?.setText(decimalFormat.format(valueOne) + "/")
            calculationEditText?.setText(null)
        }

        equalButton?.setOnClickListener{
            computeCalculation()
            resultTextView?.setText(
                resultTextView?.getText().toString() +
                        decimalFormat.format(valueTwo) + " = " + decimalFormat.format(valueOne)
            )
            valueOne = java.lang.Double.NaN
            CURRENT_ACTION = '0'
        }

        clearButton?.setOnClickListener{
            val value: String = calculationEditText?.text.toString()
            if (value.trim().isNotEmpty()) {
                val currentText = calculationEditText?.getText()
                calculationEditText?.setText(currentText?.subSequence(0, currentText.length - 1))
            } else {
                valueOne = java.lang.Double.NaN
                valueTwo = java.lang.Double.NaN
                calculationEditText?.setText("")
                resultTextView?.setText("")
            }
        }

        return root
    }

    private fun computeCalculation() {
        if (!java.lang.Double.isNaN(valueOne)) {
            valueTwo = java.lang.Double.parseDouble(calculationEditText?.getText().toString())
            val secondNumber = valueTwo
            if (secondNumber != null) {
                calculationEditText?.setText(null)
                if (CURRENT_ACTION == ADDITION)
                    valueOne = this.valueOne + secondNumber
                else if (CURRENT_ACTION == SUBTRACTION)
                    valueOne = this.valueOne - secondNumber
                else if (CURRENT_ACTION == MULTIPLICATION)
                    valueOne = this.valueOne * secondNumber
                else if (CURRENT_ACTION == DIVISION)
                    valueOne = this.valueOne / secondNumber
            }

        } else {
            try {
                valueOne = java.lang.Double.parseDouble(calculationEditText?.getText().toString())
            } catch (e: Exception) {
                print(e)
            }
        }
    }
}