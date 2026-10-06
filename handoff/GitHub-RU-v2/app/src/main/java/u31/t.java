package u31;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t extends v {
    public static final RectF h = new RectF();
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;

    public t(float f, float f2, float f3, float f4) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    @Override // u31.v
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f = this.d;
        float f2 = this.e;
        RectF rectF = h;
        rectF.set(this.b, this.c, f, f2);
        path.arcTo(rectF, this.f, this.g, false);
        path.transform(matrix);
    }
}
