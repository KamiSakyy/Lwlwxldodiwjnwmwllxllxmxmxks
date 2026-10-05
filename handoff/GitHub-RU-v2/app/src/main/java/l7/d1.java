package l7;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: /home/user/work/p/classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f28086a;

    /* renamed from: b, reason: collision with root package name */
    public int f28087b;

    /* renamed from: c, reason: collision with root package name */
    public Set f28088c;

    public final c1 a(int i) {
        SparseArray sparseArray = this.f28086a;
        c1 c1Var = (c1) sparseArray.get(i);
        if (c1Var != null) {
            return c1Var;
        }
        c1 c1Var2 = new c1();
        sparseArray.put(i, c1Var2);
        return c1Var2;
    }

    public final void b(int i) {
        c1 a10 = a(i);
        a10.f28077b = 1;
        ArrayList arrayList = a10.f28076a;
        while (arrayList.size() > 1) {
            arrayList.remove(arrayList.size() - 1);
        }
    }
}
