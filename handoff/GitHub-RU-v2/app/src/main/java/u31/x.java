package u31;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public x() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f) {
        float f2 = this.d;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.b;
        float f5 = this.c;
        t tVar = new t(f4, f5, f4, f5);
        tVar.f = this.d;
        tVar.g = f3;
        this.g.add(new r(tVar));
        this.d = f;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((v) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f, float f2) {
        u uVar = new u();
        uVar.b = f;
        uVar.c = f2;
        this.f.add(uVar);
        s sVar = new s(uVar, this.b, this.c);
        float b = sVar.b() + 270.0f;
        float b2 = sVar.b() + 270.0f;
        a(b);
        this.g.add(sVar);
        this.d = b2;
        this.b = f;
        this.c = f2;
    }

    public final void d(float f, float f2, float f3) {
        this.a = f;
        this.b = 0.0f;
        this.c = f;
        this.d = f2;
        this.e = (f2 + f3) % 360.0f;
        this.f.clear();
        this.g.clear();
    }
}
