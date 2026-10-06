package q81;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes5.dex */
public final class k {
    public ArrayList a;
    public ArrayList b;

    public k(int i) {
        switch (i) {
            case 1:
                this.a = new ArrayList();
                this.b = new ArrayList();
                break;
            default:
                this.a = new ArrayList();
                this.b = new ArrayList();
                break;
        }
    }

    public void a(String str, String str2) {
        k71.k.g(str, "name");
        k71.k.g(str2, "value");
        this.a.add(f91.a.b(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
        this.b.add(f91.a.b(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
    }

    public void b(ArrayList arrayList) {
        this.b.add(arrayList);
    }

    public void c(x91.d dVar) {
        this.a.addAll(dVar.b);
        this.b.addAll(dVar.c);
    }
}
