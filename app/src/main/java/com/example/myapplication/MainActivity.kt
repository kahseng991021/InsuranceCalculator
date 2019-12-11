package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var premium:Int = 0
        var smoker:Int = 0
        var male:Int =0
        var result:Int


        button1.setOnClickListener()
        {

            if (Sp1.selectedItemPosition == 0)
            {

                premium =60

            }
            else if (Sp1.selectedItemPosition == 1)
            {
                if(C1.isChecked)
                {
                    smoker =100
                }
                else
                {
                    smoker =0
                }

                if(R1.isChecked)
                {
                    male =50
                }
                else
                {
                    male =0
                }

                premium =90

            }
            else if (Sp1.selectedItemPosition == 2)
            {
                if(C1.isChecked)
                {
                    smoker =150
                }
                else
                {
                    smoker =0
                }

                if(R1.isChecked)
                {
                    male =100
                }
                else
                {
                    male =0
                }

                premium =90

            }  else if (Sp1.selectedItemPosition == 3)
            {
                if(C1.isChecked)
                {
                    smoker =200
                }
                else
                {
                    smoker =0
                }

                if(R1.isChecked)
                {
                    male =150
                }   else
                {
                    male =0
                }

                premium =120

            }  else if (Sp1.selectedItemPosition == 4)
            {
                if(C1.isChecked)
                {
                    smoker =250
                }
                else
                {
                    smoker =0
                }

                if(R1.isChecked)
                {
                    male =200
                }   else
                {
                    male =0
                }

                premium =150

            }  else if (Sp1.selectedItemPosition == 5)
            {
                if(C1.isChecked)
                {
                    smoker =300
                }
                else
                {
                    smoker =0
                }

                if(R1.isChecked)
                {
                    male =200
                }   else
                {
                    male =0
                }

                premium =150

            }
            result = premium+ smoker+male
            Result.text = result.toString()

        }
        button2.setOnClickListener()
        {
            radioGroup.clearCheck()
           C1.isChecked =false
            Result.text = null
            result = 0
            smoker = 0
            male =0
            premium =0
            Sp1.setSelection(0)
        }


    }
}
