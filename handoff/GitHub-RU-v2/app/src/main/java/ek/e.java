package ek;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.service.models.response.shortcuts.ShortcutColor;
import com.github.service.models.response.shortcuts.ShortcutIcon;
import com.github.service.models.response.shortcuts.ShortcutType;
import java.util.List;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final com.github.service.models.response.shortcuts.a e;
    public final ShortcutType f;
    public final ShortcutColor g;
    public final ShortcutIcon h;

    public e(ShortcutColor shortcutColor, ShortcutIcon shortcutIcon, com.github.service.models.response.shortcuts.a aVar, ShortcutType shortcutType, String str, String str2, String str3, List list) {
        k.g(str, "id");
        k.g(str2, "name");
        k.g(str3, "fullQueryString");
        k.g(aVar, "scope");
        k.g(shortcutType, "type");
        k.g(shortcutColor, "color");
        k.g(shortcutIcon, "icon");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = aVar;
        this.f = shortcutType;
        this.g = shortcutColor;
        this.h = shortcutIcon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k.b(this.a, eVar.a) && k.b(this.b, eVar.b) && k.b(this.c, eVar.c) && k.b(this.d, eVar.d) && k.b(this.e, eVar.e) && this.f == eVar.f && this.g == eVar.g && this.h == eVar.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + f1.e.c(this.d, h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("ShortcutsEntry(id=", this.a, ", name=", this.b, ", fullQueryString=");
        o.append(this.c);
        o.append(", query=");
        o.append(this.d);
        o.append(", scope=");
        o.append(this.e);
        o.append(", type=");
        o.append(this.f);
        o.append(", color=");
        o.append(this.g);
        o.append(", icon=");
        o.append(this.h);
        o.append(")");
        return o.toString();
    }
    public Object c(Object p1, Object p2, Object p3) { return null; }
}
