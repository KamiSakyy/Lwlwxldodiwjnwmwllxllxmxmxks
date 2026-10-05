package t3;

import s3.i;
import x.r0;
import x.s;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f32054a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* renamed from: b, reason: collision with root package name */
    public static volatile r0 f32055b = new r0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f32056c;

    static {
        Object[] objArr = new Object[0];
        f32056c = objArr;
        synchronized (objArr) {
            f32055b.g((int) 115.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f32055b.g((int) 130.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f32055b.g((int) 150.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f32055b.g((int) 180.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f32055b.g((int) 200.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f32055b.e(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        i.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static a a(float f6) {
        float e5;
        a aVar;
        float[] fArr = f32054a;
        if (f6 < 1.03f) {
            return null;
        }
        int i = (int) (f6 * 100.0f);
        a aVar2 = (a) f32055b.d(i);
        if (aVar2 != null) {
            return aVar2;
        }
        r0 r0Var = f32055b;
        if (r0Var.f33615r) {
            s.a(r0Var);
        }
        int a10 = y.a.a(r0Var.f33618u, i, r0Var.f33616s);
        if (a10 >= 0) {
            return (a) f32055b.i(a10);
        }
        int i10 = -(a10 + 1);
        int i11 = i10 - 1;
        if (i10 >= f32055b.h()) {
            c cVar = new c(new float[]{1.0f}, new float[]{f6});
            b(f6, cVar);
            return cVar;
        }
        if (i11 < 0) {
            aVar = new c(fArr, fArr);
            e5 = 1.0f;
        } else {
            e5 = f32055b.e(i11) / 100.0f;
            aVar = (a) f32055b.i(i11);
        }
        float e10 = f32055b.e(i10) / 100.0f;
        float max = (Math.max(0.0f, Math.min(1.0f, e5 == e10 ? 0.0f : (f6 - e5) / (e10 - e5))) * 1.0f) + 0.0f;
        a aVar3 = (a) f32055b.i(i10);
        float[] fArr2 = new float[9];
        for (int i12 = 0; i12 < 9; i12++) {
            float f10 = fArr[i12];
            float b10 = aVar.b(f10);
            fArr2[i12] = ((aVar3.b(f10) - b10) * max) + b10;
        }
        c cVar2 = new c(fArr, fArr2);
        b(f6, cVar2);
        return cVar2;
    }

    public static void b(float f6, c cVar) {
        synchronized (f32056c) {
            r0 clone = f32055b.clone();
            clone.g((int) (f6 * 100.0f), cVar);
            f32055b = clone;
        }
    }
}
