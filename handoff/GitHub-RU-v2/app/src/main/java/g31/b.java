package g31;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import l7.t0;
import l7.w0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b extends t0 {
    public final Paint a;
    public final List b;

    public b() {
        Paint paint = new Paint();
        this.a = paint;
        this.b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    public final void h(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int H;
        int I;
        int i;
        int i2;
        float dimension = recyclerView.getResources().getDimension(2131165489);
        Paint paint = this.a;
        paint.setStrokeWidth(dimension);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((d) it.next()).getClass();
            paint.setColor(r4.a.b(-65281, 0.0f, -16776961));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).J0()) {
                c cVar = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q;
                switch (cVar.b) {
                    case 0:
                        i = 0;
                        break;
                    default:
                        i = cVar.c.J();
                        break;
                }
                float f = i;
                c cVar2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q;
                switch (cVar2.b) {
                    case 0:
                        i2 = ((w0) cVar2.c).o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = cVar2.c;
                        i2 = ((w0) carouselLayoutManager).o - carouselLayoutManager.G();
                        break;
                }
                canvas2 = canvas;
                canvas2.drawLine(0.0f, f, 0.0f, i2, paint);
            } else {
                canvas2 = canvas;
                c cVar3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q;
                switch (cVar3.b) {
                    case 0:
                        H = cVar3.c.H();
                        break;
                    default:
                        H = 0;
                        break;
                }
                float f2 = H;
                c cVar4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q;
                switch (cVar4.b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = cVar4.c;
                        I = ((w0) carouselLayoutManager2).n - carouselLayoutManager2.I();
                        break;
                    default:
                        I = ((w0) cVar4.c).n;
                        break;
                }
                canvas2.drawLine(f2, 0.0f, I, 0.0f, paint);
            }
            canvas = canvas2;
        }
    }


}
