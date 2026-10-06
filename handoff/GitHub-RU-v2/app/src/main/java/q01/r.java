package q01;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.service.models.response.shortcuts.ShortcutColor;
import com.github.service.models.response.shortcuts.ShortcutIcon;
import com.github.service.models.response.shortcuts.ShortcutType;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r implements k {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final com.github.service.models.response.shortcuts.a e;
    public final ShortcutType f;
    public final ShortcutColor g;
    public final ShortcutIcon h;

    public r(String str, String str2, String str3, ArrayList arrayList, com.github.service.models.response.shortcuts.a aVar, ShortcutType shortcutType, ShortcutColor shortcutColor, ShortcutIcon shortcutIcon) {
        k71.k.g(shortcutType, "type");
        k71.k.g(shortcutColor, "color");
        k71.k.g(shortcutIcon, "icon");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
        this.e = aVar;
        this.f = shortcutType;
        this.g = shortcutColor;
        this.h = shortcutIcon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.a.equals(rVar.a) && this.b.equals(rVar.b) && this.c.equals(rVar.c) && this.d.equals(rVar.d) && this.e.equals(rVar.e) && this.f == rVar.f && this.g == rVar.g && this.h == rVar.h;
    }

    @Override // q01.k
    public final ShortcutColor f() {
        return this.g;
    }

    @Override // q01.k
    public final String g() {
        return this.c;
    }

    @Override // q01.k
    public final ShortcutIcon getIcon() {
        return this.h;
    }

    @Override // q01.k
    public final String getName() {
        return this.b;
    }

    @Override // q01.k
    public final ShortcutType getType() {
        return this.f;
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + no.a.b(this.d, h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31)) * 31)) * 31)) * 31);
    }

    @Override // q01.k
    public final com.github.service.models.response.shortcuts.a i() {
        return this.e;
    }

    public final String toString() {
        StringBuilder o = s0.o("SyncedShortcut(id=", this.a, ", name=", this.b, ", query=");
        o.append(this.c);
        o.append(", queryTerms=");
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
}
