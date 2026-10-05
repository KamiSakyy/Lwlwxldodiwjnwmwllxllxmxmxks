package u31;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p {
    public final x[] a = new x[4];
    public final Matrix[] b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];
    public final PointF d = new PointF();
    public final Path e = new Path();
    public final Path f = new Path();
    public final x g = new x();
    public final float[] h = new float[2];
    public final float[] i = new float[2];
    public final Path j = new Path();
    public final Path k = new Path();
    public final boolean l = true;

    public p() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new x();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public final void a(n nVar, float[] fArr, float f, RectF rectF, g gVar, Path path) {
        Matrix[] matrixArr;
        float[] fArr2;
        int i;
        x[] xVarArr;
        Matrix[] matrixArr2;
        boolean z;
        float f2;
        boolean z2;
        int i2;
        path.rewind();
        Path path2 = this.e;
        path2.rewind();
        Path path3 = this.f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            matrixArr = this.c;
            fArr2 = this.h;
            xVarArr = this.a;
            matrixArr2 = this.b;
            z = 0;
            if (i3 >= 4) {
                break;
            }
            d cVar = fArr == null ? i3 != 1 ? i3 != 2 ? i3 != 3 ? nVar.f : nVar.e : nVar.h : nVar.g : new c(fArr[i3]);
            sy.u uVar = i3 != 1 ? i3 != 2 ? i3 != 3 ? nVar.b : nVar.a : nVar.d : nVar.c;
            x xVar = xVarArr[i3];
            uVar.getClass();
            uVar.g(xVar, f, cVar.a(rectF));
            int i4 = i3 + 1;
            float f3 = (i4 % 4) * 90;
            matrixArr2[i3].reset();
            PointF pointF = this.d;
            if (i3 == 1) {
                i2 = i3;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i3 == 2) {
                i2 = i3;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i3 != 3) {
                i2 = i3;
                pointF.set(rectF.right, rectF.top);
            } else {
                i2 = i3;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f3);
            x xVar2 = xVarArr[i2];
            fArr2[0] = xVar2.b;
            fArr2[1] = xVar2.c;
            matrixArr2[i2].mapPoints(fArr2);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr2[0], fArr2[1]);
            matrixArr[i2].preRotate(f3);
            i3 = i4;
        }
        int i5 = 0;
        for (i = 4; i5 < i; i = 4) {
            x xVar3 = xVarArr[i5];
            xVar3.getClass();
            fArr2[z] = 0.0f;
            fArr2[1] = xVar3.a;
            matrixArr2[i5].mapPoints(fArr2);
            if (i5 == 0) {
                path.moveTo(fArr2[z], fArr2[1]);
            } else {
                path.lineTo(fArr2[z], fArr2[1]);
            }
            xVarArr[i5].b(matrixArr2[i5], path);
            if (gVar != null) {
                x xVar4 = xVarArr[i5];
                Matrix matrix = matrixArr2[i5];
                j jVar = gVar.a;
                f2 = 0.0f;
                BitSet bitSet = jVar.v;
                xVar4.getClass();
                bitSet.set(i5, z);
                w[] wVarArr = jVar.t;
                xVar4.a(xVar4.e);
                wVarArr[i5] = new q(new ArrayList(xVar4.g), new Matrix(matrix));
            } else {
                f2 = 0.0f;
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            x xVar5 = xVarArr[i5];
            fArr2[0] = xVar5.b;
            fArr2[1] = xVar5.c;
            matrixArr2[i5].mapPoints(fArr2);
            x xVar6 = xVarArr[i7];
            xVar6.getClass();
            float[] fArr3 = this.i;
            fArr3[0] = f2;
            fArr3[1] = xVar6.a;
            matrixArr2[i7].mapPoints(fArr3);
            Matrix[] matrixArr3 = matrixArr;
            x[] xVarArr2 = xVarArr;
            float max = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, f2);
            x xVar7 = xVarArr2[i5];
            fArr2[0] = xVar7.b;
            fArr2[1] = xVar7.c;
            matrixArr2[i5].mapPoints(fArr2);
            if (i5 == 1 || i5 == 3) {
                Math.abs(rectF.centerX() - fArr2[0]);
            } else {
                Math.abs(rectF.centerY() - fArr2[1]);
            }
            x xVar8 = this.g;
            xVar8.d(0.0f, 270.0f, 0.0f);
            (i5 != 1 ? i5 != 2 ? i5 != 3 ? nVar.j : nVar.i : nVar.l : nVar.k).getClass();
            xVar8.c(max, 0.0f);
            Path path4 = this.j;
            path4.reset();
            xVar8.b(matrixArr3[i5], path4);
            if (this.l && (b(path4, i5) || b(path4, i7))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = xVar8.a;
                matrixArr3[i5].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                xVar8.b(matrixArr3[i5], path2);
            } else {
                xVar8.b(matrixArr3[i5], path);
            }
            if (gVar != null) {
                Matrix matrix2 = matrixArr3[i5];
                j jVar2 = gVar.a;
                z2 = false;
                jVar2.v.set(i5 + 4, false);
                w[] wVarArr2 = jVar2.u;
                xVar8.a(xVar8.e);
                wVarArr2[i5] = new q(new ArrayList(xVar8.g), new Matrix(matrix2));
            } else {
                z2 = false;
            }
            matrixArr = matrixArr3;
            i5 = i6;
            z = z2;
            xVarArr = xVarArr2;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public final boolean b(Path path, int i) {
        Path path2 = this.k;
        path2.reset();
        this.a[i].b(this.b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
