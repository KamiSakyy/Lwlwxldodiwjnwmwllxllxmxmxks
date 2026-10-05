package u31;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u extends v {
    public float b;
    public float c;

    @Override // u31.v
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.b, this.c);
        path.transform(matrix);
    }
}
