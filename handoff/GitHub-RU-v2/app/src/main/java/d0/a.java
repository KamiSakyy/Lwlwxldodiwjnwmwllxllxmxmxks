package d0;

import java.util.ArrayList;
import sy.d0;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final j2.f f20935a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f20936b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20937c;

    public a(j2.f fVar, ArrayList arrayList) {
        Object obj;
        this.f20935a = fVar;
        this.f20936b = arrayList;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int c10 = ((b) obj).f20939b.c();
            int m = d0.m(arrayList);
            int i = 1;
            if (1 <= m) {
                while (true) {
                    Object obj2 = arrayList.get(i);
                    int c11 = ((b) obj2).f20939b.c();
                    if (c10 < c11) {
                        obj = obj2;
                        c10 = c11;
                    }
                    if (i == m) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        b bVar = (b) obj;
        this.f20937c = bVar != null ? bVar.f20939b.c() : 0;
    }
}
