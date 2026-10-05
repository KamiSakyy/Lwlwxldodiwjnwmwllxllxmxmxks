package u31;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q extends w {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Matrix d;

    public q(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    @Override // u31.w
    public final void a(Matrix matrix, t31.a aVar, int i, Canvas canvas) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((w) obj).a(this.d, aVar, i, canvas);
        }
    }
}
