package aa;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /home/user/work/p/classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public String f610a;

    /* renamed from: b, reason: collision with root package name */
    public List f611b;

    /* renamed from: c, reason: collision with root package name */
    public List f612c;

    /* renamed from: d, reason: collision with root package name */
    public Map f613d;

    /* renamed from: e, reason: collision with root package name */
    public Map f614e;

    public b0(String str, List list, List list2, Map map, LinkedHashMap linkedHashMap) {
        this.f610a = str;
        this.f611b = list;
        this.f612c = list2;
        this.f613d = map;
        this.f614e = linkedHashMap;
    }

    public final String toString() {
        return "Error(message = " + this.f610a + ", locations = " + this.f611b + ", path=" + this.f612c + ", extensions = " + this.f613d + ", nonStandardFields = " + this.f614e + ')';
    }
    public Object a = null;
    public Object c = null;
    public Object d = null;
    public Object e = null;
}
