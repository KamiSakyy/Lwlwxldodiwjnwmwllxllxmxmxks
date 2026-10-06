package g4;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes.dex */
public class h extends g {
    public int m;

    public h(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f24743e = 2;
        } else {
            this.f24743e = 3;
        }
    }

    @Override // g4.g
    public final void d(int i) {
        if (this.f24747j) {
            return;
        }
        this.f24747j = true;
        this.f24745g = i;
        ArrayList arrayList = this.f24748k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            e eVar = (e) obj;
            eVar.a(eVar);
        }
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class p {
        public p() {
        }
    }

    public Object f24743e;

    public Object f24747j;

    public Object f24745g;

    public Object f24748k;
}
