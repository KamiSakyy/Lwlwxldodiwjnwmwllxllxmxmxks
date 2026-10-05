package u5;

import android.util.SparseArray;

/* loaded from: /home/user/work/p/classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f32240a;

    /* renamed from: b, reason: collision with root package name */
    public t f32241b;

    public q(int i) {
        this.f32240a = new SparseArray(i);
    }

    public final void a(t tVar, int i, int i10) {
        int a10 = tVar.a(i);
        SparseArray sparseArray = this.f32240a;
        q qVar = sparseArray == null ? null : (q) sparseArray.get(a10);
        if (qVar == null) {
            qVar = new q(1);
            sparseArray.put(tVar.a(i), qVar);
        }
        if (i10 > i) {
            qVar.a(tVar, i + 1, i10);
        } else {
            qVar.f32241b = tVar;
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class r<T1,T2,T3,T4> {
        public r() {
        }
    }
}
