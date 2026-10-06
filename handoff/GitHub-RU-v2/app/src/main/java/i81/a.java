package i81;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import jo.f4;
import kotlinx.serialization.descriptors.SerialDescriptor;
import x61.r;

/* loaded from: /home/user/work/p/classes5.dex */
public final class a {
    public final String a;
    public List b;
    public final ArrayList c;
    public final HashSet d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;

    public a(String str) {
        k71.k.g(str, "serialName");
        this.a = str;
        this.b = r.r;
        this.c = new ArrayList();
        this.d = new HashSet();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
    }

    public static void a(a aVar, String str, SerialDescriptor serialDescriptor) {
        aVar.getClass();
        k71.k.g(str, "elementName");
        k71.k.g(serialDescriptor, "descriptor");
        if (!aVar.d.add(str)) {
            StringBuilder v = f4.v("Element with name '", str, "' is already registered in ");
            v.append(aVar.a);
            throw new IllegalArgumentException(v.toString().toString());
        }
        aVar.c.add(str);
        aVar.e.add(serialDescriptor);
        aVar.f.add(r.r);
        aVar.g.add(false);
    }
    public Object b = null;
    public Object c = null;
    public Object e = null;
    public Object f = null;
    public Object g = null;
}
