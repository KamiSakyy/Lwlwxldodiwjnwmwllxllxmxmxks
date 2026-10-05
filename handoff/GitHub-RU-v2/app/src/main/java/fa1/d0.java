package fa1;

import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: /home/user/work/p/classes5.dex */
public final class d0 extends x0 {
    public final /* synthetic */ int d;
    public final Method e;
    public final int f;
    public final boolean g;

    public /* synthetic */ d0(Method method, int i, boolean z, int i2) {
        this.d = i2;
        this.e = method;
        this.f = i;
        this.g = z;
    }

    @Override // fa1.x0
    public final void a(n0 n0Var, Object obj) {
        switch (this.d) {
            case 0:
                Map map = (Map) obj;
                int i = this.f;
                Method method = this.e;
                if (map == null) {
                    throw x0.n(method, i, "Field map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw x0.n(method, i, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw x0.n(method, i, f1.e.z("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String obj2 = value.toString();
                    if (obj2 == null) {
                        throw x0.n(method, i, "Field map value '" + value + "' converted to null by " + b.class.getName() + " for key '" + str + "'.", new Object[0]);
                    }
                    n0Var.a(str, obj2, this.g);
                }
                return;
            case 1:
                Map map2 = (Map) obj;
                int i2 = this.f;
                Method method2 = this.e;
                if (map2 == null) {
                    throw x0.n(method2, i2, "Header map was null.", new Object[0]);
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    if (str2 == null) {
                        throw x0.n(method2, i2, "Header map contained null key.", new Object[0]);
                    }
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        throw x0.n(method2, i2, f1.e.z("Header map contained null value for key '", str2, "'."), new Object[0]);
                    }
                    n0Var.b(str2, value2.toString(), this.g);
                }
                return;
            default:
                Map map3 = (Map) obj;
                int i3 = this.f;
                Method method3 = this.e;
                if (map3 == null) {
                    throw x0.n(method3, i3, "Query map was null", new Object[0]);
                }
                for (Map.Entry entry3 : map3.entrySet()) {
                    String str3 = (String) entry3.getKey();
                    if (str3 == null) {
                        throw x0.n(method3, i3, "Query map contained null key.", new Object[0]);
                    }
                    Object value3 = entry3.getValue();
                    if (value3 == null) {
                        throw x0.n(method3, i3, f1.e.z("Query map contained null value for key '", str3, "'."), new Object[0]);
                    }
                    String obj3 = value3.toString();
                    if (obj3 == null) {
                        throw x0.n(method3, i3, "Query map value '" + value3 + "' converted to null by " + b.class.getName() + " for key '" + str3 + "'.", new Object[0]);
                    }
                    n0Var.d(str3, obj3, this.g);
                }
                return;
        }
    }
}
