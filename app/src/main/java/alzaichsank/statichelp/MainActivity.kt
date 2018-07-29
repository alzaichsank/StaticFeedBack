package alzaichsank.statichelp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var h1: Boolean? = false
    private var h2: Boolean? = false
    private var h3: Boolean? = false
    private var h4: Boolean? = false
    private var h5: Boolean? = false
    private var h6: Boolean? = false
    private var h7: Boolean? = false
    private var h8: Boolean? = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        help1.setOnClickListener{
            if (h1 == true) {
                answer1()
            } else {
                answer1.visibility = View.VISIBLE
                a1.setImageResource(R.drawable.expand_down_w)
                h1 = true
            }
        }

        help2.setOnClickListener {
            if (h2 == true) {
                answer2()
            } else {
                answer2.visibility = View.VISIBLE
                a2.setImageResource(R.drawable.expand_down_w)
                h2 = true
            }
        }
        help3.setOnClickListener {
            if (h3 == true) {
                answer3()
            } else {
                answer3.visibility = View.VISIBLE
                a3.setImageResource(R.drawable.expand_down_w)
                h3 = true
            }
        }

        help4.setOnClickListener {
            if (h4 == true) {
                answer4()
            } else {
                answer4.visibility = View.VISIBLE
                a4.setImageResource(R.drawable.expand_down_w)
                h4 = true
            }
        }
        help5.setOnClickListener {
            if (h5 == true) {
                answer5()
            } else {
                answer5.visibility = View.VISIBLE
                a5.setImageResource(R.drawable.expand_down_w)
                h5 = true
            }
        }
        help6.setOnClickListener {
            if (h6 == true) {
                answer6()
            } else {
                answer6.visibility = View.VISIBLE
                a6.setImageResource(R.drawable.expand_down_w)
                h6 = true
            }
        }
        help7.setOnClickListener {
            if (h7 == true) {
                answer7()
            } else {
                answer7.visibility = View.VISIBLE
                a7.setImageResource(R.drawable.expand_down_w)
                h7 = true
            }
        }
        help8.setOnClickListener {
            if (h8 == true) {
                answer8()
            } else {
                answer8.visibility = View.VISIBLE
                a8.setImageResource(R.drawable.expand_down_w)
                h8 = true
            }
        }
    }
    private fun answer1() {
        answer1.visibility = View.GONE
        a1.setImageResource(R.drawable.expand_up_w)
        h1 = false
    }

    private fun answer2() {
        answer2.visibility = View.GONE
        a2.setImageResource(R.drawable.expand_up_w)
        h2 = false
    }

    private fun answer3() {
        answer3.visibility = View.GONE
        a3.setImageResource(R.drawable.expand_up_w)
        h3 = false
    }

    private fun answer4() {
        answer4.visibility = View.GONE
        a4.setImageResource(R.drawable.expand_up_w)
        h4 = false
    }

    private fun answer5() {
        answer5.visibility = View.GONE
        a5.setImageResource(R.drawable.expand_up_w)
        h5 = false
    }

    private fun answer6() {
        answer6.visibility = View.GONE
        a6.setImageResource(R.drawable.expand_up_w)
        h6 = false
    }

    private fun answer7() {
        answer7.visibility = View.GONE
        a7.setImageResource(R.drawable.expand_up_w)
        h7 = false
    }

    private fun answer8() {
        answer8.visibility = View.GONE
        a8.setImageResource(R.drawable.expand_up_w)
        h8 = false
    }
    
}
