package h0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public int f25158a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f25159b;

    public q1(int i) {
        switch (i) {
            case 5:
                this.f25159b = new ArrayList();
                this.f25158a = 128;
                break;
            default:
                this.f25159b = new ArrayList();
                break;
        }
    }

    public void a(List list) {
        k71.k.g(list, "nodes");
        this.f25159b.addAll(list);
    }

    public q1(int i, ArrayList arrayList) {
        this.f25159b = arrayList;
        this.f25158a = i;
    }
}
