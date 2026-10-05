package d2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;

/* loaded from: /home/user/work/p/classes.dex */
public final class c implements r {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f21323a = d.f21327a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f21324b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f21325c;

    @Override // d2.r
    public final void a(float f6, float f10) {
        this.f21323a.scale(f6, f10);
    }

    @Override // d2.r
    public final void b(float f6) {
        this.f21323a.rotate(f6);
    }

    @Override // d2.r
    public final void d(float f6, float f10, float f11, float f12, float f13, float f14, boolean z10, y11.l lVar) {
        this.f21323a.drawArc(f6, f10, f11, f12, f13, f14, z10, (Paint) lVar.b);
    }

    @Override // d2.r
    public final void e(long j10, long j11, y11.l lVar) {
        this.f21323a.drawLine(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), (Paint) lVar.b);
    }

    @Override // d2.r
    public final void f() {
        this.f21323a.save();
    }

    @Override // d2.r
    public final void g(g gVar, y11.l lVar) {
        this.f21323a.drawBitmap(a0.j(gVar), Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0), (Paint) lVar.b);
    }

    @Override // d2.r
    public final void h(float f6, float f10, float f11, float f12, float f13, float f14, y11.l lVar) {
        this.f21323a.drawRoundRect(f6, f10, f11, f12, f13, f14, (Paint) lVar.b);
    }

    @Override // d2.r
    public final void i(c2.c cVar, y11.l lVar) {
        this.f21323a.saveLayer(cVar.f4060a, cVar.f4061b, cVar.f4062c, cVar.f4063d, (Paint) lVar.b, 31);
    }

    @Override // d2.r
    public final void j() {
        a0.m(this.f21323a, false);
    }

    @Override // d2.r
    public final void k(float f6, long j10, y11.l lVar) {
        this.f21323a.drawCircle(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), f6, (Paint) lVar.b);
    }

    @Override // d2.r
    public final void l(float[] fArr) {
        if (a0.r(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        a0.t(matrix, fArr);
        this.f21323a.concat(matrix);
    }

    @Override // d2.r
    public final void m(float f6, float f10, float f11, float f12, y11.l lVar) {
        this.f21323a.drawRect(f6, f10, f11, f12, (Paint) lVar.b);
    }

    @Override // d2.r
    public final void n(i iVar) {
        Canvas canvas = this.f21323a;
        if (!(iVar instanceof i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(iVar.f21346a, Region.Op.INTERSECT);
    }

    @Override // d2.r
    public final void o(float f6, float f10, float f11, float f12, int i) {
        this.f21323a.clipRect(f6, f10, f11, f12, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // d2.r
    public final void p(float f6, float f10) {
        this.f21323a.translate(f6, f10);
    }

    @Override // d2.r
    public final void q() {
        this.f21323a.restore();
    }

    @Override // d2.r
    public final void r(g gVar, long j10, long j11, long j12, y11.l lVar) {
        if (this.f21324b == null) {
            this.f21324b = new Rect();
            this.f21325c = new Rect();
        }
        Canvas canvas = this.f21323a;
        Bitmap j13 = a0.j(gVar);
        Rect rect = this.f21324b;
        k71.k.d(rect);
        int i = (int) (j10 >> 32);
        rect.left = i;
        int i10 = (int) (j10 & 4294967295L);
        rect.top = i10;
        rect.right = i + ((int) (j11 >> 32));
        rect.bottom = i10 + ((int) (j11 & 4294967295L));
        Rect rect2 = this.f21325c;
        k71.k.d(rect2);
        int i11 = (int) 0;
        rect2.left = i11;
        int i12 = (int) 0;
        rect2.top = i12;
        rect2.right = i11 + ((int) (j12 >> 32));
        rect2.bottom = i12 + ((int) (4294967295L & j12));
        canvas.drawBitmap(j13, rect, rect2, (Paint) lVar.b);
    }

    @Override // d2.r
    public final void s(i iVar, y11.l lVar) {
        Canvas canvas = this.f21323a;
        if (!(iVar instanceof i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(iVar.f21346a, (Paint) lVar.b);
    }

    @Override // d2.r
    public final void t() {
        a0.m(this.f21323a, true);
    }
}
