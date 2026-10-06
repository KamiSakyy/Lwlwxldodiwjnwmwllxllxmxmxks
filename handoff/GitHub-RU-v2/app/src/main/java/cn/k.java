package cn;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k {
    public String a;
    public h01.q b;
    public Object c;
    public final /* synthetic */ s d;

    public k(s sVar, String str, h01.q qVar, List list) {
        k71.k.g(qVar, "timeline");
        this.d = sVar;
        this.a = str;
        this.b = qVar;
        this.c = list;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    public final void a() {
        s sVar = this.d;
        ConcurrentHashMap concurrentHashMap = sVar.e;
        String str = this.a;
        if (((hShadow) concurrentHashMap.get(str)) != null) {
            concurrentHashMap.put(str, new hShadow(this.b, this.c));
        }
        sVar.c(str);
    }
    public static final Object a = null;
}
