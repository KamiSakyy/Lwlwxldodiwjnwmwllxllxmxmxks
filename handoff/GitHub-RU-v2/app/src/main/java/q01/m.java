package q01;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.service.models.response.shortcuts.ShortcutColor;
import com.github.service.models.response.shortcuts.ShortcutIcon;
import com.github.service.models.response.shortcuts.ShortcutType;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m implements k {
    public final String a;
    public final String b;
    public final com.github.service.models.response.shortcuts.a c;
    public final ShortcutType d;
    public final ShortcutColor e;
    public final ShortcutIcon f;

    public m(String str, String str2, com.github.service.models.response.shortcuts.a aVar, ShortcutType shortcutType, ShortcutColor shortcutColor, ShortcutIcon shortcutIcon) {
        k71.k.g(str, "name");
        k71.k.g(str2, "query");
        k71.k.g(aVar, "scope");
        k71.k.g(shortcutType, "type");
        k71.k.g(shortcutColor, "color");
        k71.k.g(shortcutIcon, "icon");
        this.a = str;
        this.b = str2;
        this.c = aVar;
        this.d = shortcutType;
        this.e = shortcutColor;
        this.f = shortcutIcon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return k71.k.b(this.a, mVar.a) && k71.k.b(this.b, mVar.b) && k71.k.b(this.c, mVar.c) && this.d == mVar.d && this.e == mVar.e && this.f == mVar.f;
    }

    @Override // q01.k
    public final ShortcutColor f() {
        return this.e;
    }

    @Override // q01.k
    public final String g() {
        return this.b;
    }

    @Override // q01.k
    public final ShortcutIcon getIcon() {
        return this.f;
    }

    @Override // q01.k
    public final String getName() {
        return this.a;
    }

    @Override // q01.k
    public final ShortcutType getType() {
        return this.d;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31)) * 31)) * 31)) * 31);
    }

    @Override // q01.k
    public final com.github.service.models.response.shortcuts.a i() {
        return this.c;
    }

    public final String toString() {
        StringBuilder o = s0.o("ShortcutConfiguration(name=", this.a, ", query=", this.b, ", scope=");
        o.append(this.c);
        o.append(", type=");
        o.append(this.d);
        o.append(", color=");
        o.append(this.e);
        o.append(", icon=");
        o.append(this.f);
        o.append(")");
        return o.toString();
    }
}
