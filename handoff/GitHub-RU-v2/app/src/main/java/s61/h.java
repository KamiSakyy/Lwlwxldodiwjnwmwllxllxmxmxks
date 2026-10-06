package s61;

import android.graphics.PointF;
import es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h {
    public final float a;
    public final PointF b;
    public final PointF c;
    public long d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public final /* synthetic */ SubsamplingScaleImageView i;

    public h(SubsamplingScaleImageView subsamplingScaleImageView, PointF pointF) {
        this.i = subsamplingScaleImageView;
        this.d = 500L;
        this.e = 2;
        this.f = 1;
        this.g = true;
        this.h = true;
        this.a = subsamplingScaleImageView.M;
        this.b = pointF;
        this.c = null;
    }

    public final void a() {
        SubsamplingScaleImageView subsamplingScaleImageView = this.i;
        int width = (((subsamplingScaleImageView.getWidth() - subsamplingScaleImageView.getPaddingRight()) - subsamplingScaleImageView.getPaddingLeft()) / 2) + subsamplingScaleImageView.getPaddingLeft();
        int height = (((subsamplingScaleImageView.getHeight() - subsamplingScaleImageView.getPaddingBottom()) - subsamplingScaleImageView.getPaddingTop()) / 2) + subsamplingScaleImageView.getPaddingTop();
        float min = Math.min(subsamplingScaleImageView.x, Math.max(subsamplingScaleImageView.p(), this.a));
        boolean z = this.h;
        PointF pointF = this.b;
        if (z) {
            float f = pointF.x;
            float f2 = pointF.y;
            PointF pointF2 = new PointF();
            PointF z2 = subsamplingScaleImageView.z(f, f2, min);
            pointF2.set((((((subsamplingScaleImageView.getWidth() - subsamplingScaleImageView.getPaddingRight()) - subsamplingScaleImageView.getPaddingLeft()) / 2) + subsamplingScaleImageView.getPaddingLeft()) - z2.x) / min, (((((subsamplingScaleImageView.getHeight() - subsamplingScaleImageView.getPaddingBottom()) - subsamplingScaleImageView.getPaddingTop()) / 2) + subsamplingScaleImageView.getPaddingTop()) - z2.y) / min);
            pointF = pointF2;
        }
        g gVar = new g();
        gVar.g = 500L;
        gVar.h = true;
        gVar.i = 2;
        gVar.j = 1;
        gVar.k = System.currentTimeMillis();
        subsamplingScaleImageView.s0 = gVar;
        gVar.a = subsamplingScaleImageView.M;
        gVar.b = min;
        gVar.k = System.currentTimeMillis();
        subsamplingScaleImageView.s0.getClass();
        subsamplingScaleImageView.s0.c = subsamplingScaleImageView.getCenter();
        g gVar2 = subsamplingScaleImageView.s0;
        gVar2.d = pointF;
        float f3 = pointF.x;
        float f4 = pointF.y;
        PointF pointF3 = new PointF();
        if (subsamplingScaleImageView.O == null) {
            pointF3 = null;
        } else {
            pointF3.set(subsamplingScaleImageView.x(f3), subsamplingScaleImageView.y(f4));
        }
        gVar2.e = pointF3;
        subsamplingScaleImageView.s0.f = new PointF(width, height);
        g gVar3 = subsamplingScaleImageView.s0;
        gVar3.g = this.d;
        gVar3.h = this.g;
        gVar3.i = this.e;
        gVar3.j = this.f;
        gVar3.k = System.currentTimeMillis();
        subsamplingScaleImageView.s0.getClass();
        PointF pointF4 = this.c;
        if (pointF4 != null) {
            float f5 = pointF4.x;
            PointF pointF5 = subsamplingScaleImageView.s0.c;
            float f6 = f5 - (pointF5.x * min);
            float f7 = pointF4.y - (pointF5.y * min);
            PointF pointF6 = new PointF(f6, f7);
            subsamplingScaleImageView.l(true, new j(min, pointF6));
            subsamplingScaleImageView.s0.f = new PointF((pointF6.x - f6) + pointF4.x, (pointF6.y - f7) + pointF4.y);
        }
        subsamplingScaleImageView.invalidate();
    }

    public h(SubsamplingScaleImageView subsamplingScaleImageView, float f, PointF pointF) {
        this.i = subsamplingScaleImageView;
        this.d = 500L;
        this.e = 2;
        this.f = 1;
        this.g = true;
        this.h = true;
        this.a = f;
        this.b = pointF;
        this.c = null;
    }

    public h(SubsamplingScaleImageView subsamplingScaleImageView, float f, PointF pointF, PointF pointF2) {
        this.i = subsamplingScaleImageView;
        this.d = 500L;
        this.e = 2;
        this.f = 1;
        this.g = true;
        this.h = true;
        this.a = f;
        this.b = pointF;
        this.c = pointF2;
    }
}
