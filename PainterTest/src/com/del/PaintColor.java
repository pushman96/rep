package com.del;

import com.del.service.ColorInterface;
import com.del.service.GreenColor;
import com.del.service.PainterService;
import com.del.service.RedColor;
public class PaintColor {
	
	public static void main(String[] args) {
		PainterService pService=new PainterService();
		ColorInterface ci=
				() -> System.out.println("Painting with blue color");
		/*@Override
		public void paintColor() {
			System.out.println();
		}
	}

}*/
				pService.paint(ci);
	}
}
