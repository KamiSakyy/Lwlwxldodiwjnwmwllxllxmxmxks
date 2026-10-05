package ea1;

import java.util.ArrayList;
import java.util.Comparator;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class d extends n {
    public boolean e;
    public int c = 0;
    public int d = 0;
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();

    @Override // ea1.n
    public final int a() {
        return this.d;
    }

    @Override // ea1.n
    public final boolean b() {
        return this.e;
    }

    public final void c() {
        ArrayList arrayList = this.a;
        this.c = arrayList.size();
        int i = 0;
        this.d = 0;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            this.d = ((n) obj).a() + this.d;
        }
        ArrayList arrayList2 = this.b;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        arrayList2.sort(Comparator.comparingInt(new a()));
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            if (((n) obj2).b()) {
                this.e = true;
                return;
            }
        }
    }
}
