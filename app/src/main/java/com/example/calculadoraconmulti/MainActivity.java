package com.example.calculadoraconmulti;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button but1, but2, but3, but4, but5, but6, but7, but8, but9, but0, butPlus, butEquals, butClear, butMinus, butMult;
    TextView screen;

    boolean showingResult = false;
    Calculator calc = new Calculator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but1 = findViewById(R.id.button1);
        but2 = findViewById(R.id.button2);
        but3 = findViewById(R.id.button3);
        but4 = findViewById(R.id.button4);
        but5 = findViewById(R.id.button5);
        but6 = findViewById(R.id.button6);
        but7 = findViewById(R.id.button7);
        but8 = findViewById(R.id.button8);
        but9 = findViewById(R.id.button9);
        but0 = findViewById(R.id.button0);
        butPlus = findViewById(R.id.plusButton);
        butMinus = findViewById(R.id.minusButton);
        butMult = findViewById(R.id.multButton);
        butEquals = findViewById(R.id.equalsButton);
        butClear = findViewById(R.id.clearButton);
        screen = findViewById(R.id.screenTextView);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (showingResult) {
                    showingResult = false;
                    screen.setText("1");
                } else {
                    if (screen.getText().equals("0")) {
                        screen.setText("1");
                    } else {
                        CharSequence text = screen.getText();
                        screen.setText(text + "1");
                    }
                }

            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (showingResult) {
                    showingResult = false;
                    screen.setText("2");
                } else {
                    if (screen.getText().equals("0")) {
                        screen.setText("2");
                    } else {
                        CharSequence text = screen.getText();
                        screen.setText(text + "2");
                    }
                }

            }
        });


        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (showingResult) {
                    showingResult = false;
                    screen.setText("3");
                } else {
                    if (screen.getText().equals("0")) {
                        screen.setText("3");
                    } else {
                        CharSequence text = screen.getText();
                        screen.setText(text + "3");
                    }
                }

            }
        });


        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (showingResult) {
                    showingResult = false;
                    screen.setText("4");
                } else {
                    if (screen.getText().equals("0")) {
                        screen.setText("4");
                    } else {
                        CharSequence text = screen.getText();
                        screen.setText(text + "4");
                    }
                }

            }
        });


        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (showingResult) {
                    showingResult = false;
                    screen.setText("5");
                } else {
                    if (screen.getText().equals("0")) {
                        screen.setText("5");
                    } else {
                        CharSequence text = screen.getText();
                        screen.setText(text + "5");
                    }
                }

            }
        });


        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (showingResult) {
                    showingResult = false;
                    screen.setText("6");
                } else {
                    if (screen.getText().equals("0")) {
                        screen.setText("6");
                    } else {
                        CharSequence text = screen.getText();
                        screen.setText(text + "6");
                    }
                }

            }
        });


        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (showingResult) {
                    showingResult = false;
                    screen.setText("7");
                } else {
                    if (screen.getText().equals("0")) {
                        screen.setText("7");
                    } else {
                        CharSequence text = screen.getText();
                        screen.setText(text + "7");
                    }
                }

            }
        });


        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (showingResult) {
                    showingResult = false;
                    screen.setText("8");
                } else {
                    if (screen.getText().equals("0")) {
                        screen.setText("8");
                    } else {
                        CharSequence text = screen.getText();
                        screen.setText(text + "8");
                    }
                }

            }
        });


        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (showingResult) {
                    showingResult = false;
                    screen.setText("9");
                } else {
                    if (screen.getText().equals("0")) {
                        screen.setText("9");
                    } else {
                        CharSequence text = screen.getText();
                        screen.setText(text + "9");
                    }
                }

            }
        });


        but0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (screen.getText().equals("0")) {
                    screen.setText("0");
                } else {
                    CharSequence text = screen.getText();
                    screen.setText(text + "0");
                }
            }
        });

        butPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (showingResult) {
                    showingResult = false;
                }
                if (screen.getText().equals("0")) {
                    screen.setText("0");
                } else {
                    CharSequence text = screen.getText();
                    screen.setText(text + "+");
                }

            }
        });

        butMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (showingResult) {
                    showingResult = false;
                }
                if (screen.getText().equals("0")) {
                    screen.setText("-");
                } else {
                    CharSequence text = screen.getText();
                    screen.setText(text + "-");
                }

            }
        });

        butMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (showingResult) {
                    showingResult = false;
                }
                if (screen.getText().equals("0")) {
                    screen.setText("0");
                } else {
                    CharSequence text = screen.getText();
                    screen.setText(text + "x");
                }
            }
        });


        butEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String screenText = screen.getText().toString();
                int result = calc.calculate(screenText);
                screen.setText(String.valueOf(result));
                showingResult = true;
            }
        });

        butClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText("0");
            }
        });
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putString("pantalla", screen.getText().toString());
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        screen.setText(savedInstanceState.getString("pantalla"));
        super.onRestoreInstanceState(savedInstanceState);
    }
}
