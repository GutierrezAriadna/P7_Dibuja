package com.dibuja;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.view.View;

public class DrawView extends View {
	Paint paint = new Paint();

	public DrawView(Context context) {
		super(context);
	}

	@Override
	public void onDraw(Canvas canvas) {
	   /*//.drawRect(left, top, right, bottom, paint)
        paint.setColor(Color.RED);
		canvas.drawRect(30, 30, 80, 80, paint);
	    paint.setColor(Color.CYAN);
		canvas.drawRect(33, 60, 77, 77, paint);
		paint.setColor(Color.YELLOW);
		canvas.drawRect(33, 33, 77, 60, paint);
		
		//.drawCircle(cx, cy, radius, paint);
		paint.setColor(Color.RED);
		canvas.drawCircle(100, 100, 20, paint);
		
		//.drawText(text, x, y, paint)
		canvas.drawText("Texto con CANVAS", 200, 30, paint);
		
		//.drawLine(startX, startY, stopX, stopY, paint)
        paint.setColor(Color.BLUE);
        canvas.drawLine(0, 0, 350, 100, paint);


        Path trazo = new Path();
        trazo.addCircle(150, 450, 100, Path.Direction.CCW);
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(8);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawPath(trazo, paint);
        paint.setStrokeWidth(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(20);
        paint.setTypeface(Typeface.SANS_SERIF);
        canvas.drawTextOnPath("Cecyt 9 \"Juan de Dios Bátiz\" graficos en Android ", trazo, 150, 40, paint);
        */

        paint.setColor(Color.BLUE);
        //Dibuja parte superior del hexágono
        canvas.drawLine(10,100,30,50,paint);
        canvas.drawLine(30,50,75,50,paint);
        canvas.drawLine(75,50,100,100,paint);
        //Dibuja parte inferior del hexágono
        canvas.drawLine(10,100,30,150,paint);
        canvas.drawLine(30,150,75,150,paint);
        canvas.drawLine(75,150,100,100,paint);

        paint.setColor(Color.rgb(113,123,143));

        //Dibuja pentágono que sirve como cuerpo para la estrella
        canvas.drawLine(200,100,250,50,paint);//1 lado
        canvas.drawLine(250,50,300,100,paint);//2 lado
        canvas.drawLine(200,100,225,150,paint);//3 lado
        canvas.drawLine(225,150,275,150,paint);//4 lado
        canvas.drawLine(275,150,300,100,paint);//5 lado

        //Dibuja los picos de la estrella en el mismo orden que se dibujaron los lados
        canvas.drawLine(200,100,175,40,paint);
        canvas.drawLine(175,40,250,50,paint);//picos lados 1-2
        canvas.drawLine(250,50,325,40,paint);
        canvas.drawLine(325,40,300,100,paint);//picos lados 2-3
        canvas.drawLine(200,100,165,150,paint);
        canvas.drawLine(165,150,225,150,paint);//picos lados 3-4
        canvas.drawLine(225,150,250,200,paint);
        canvas.drawLine(250,200,275,150,paint);//picos lados 4-5
        canvas.drawLine(275,150,335,150,paint);
        canvas.drawLine(335,150,300,100,paint);//picos lados 5-1

	}

}
