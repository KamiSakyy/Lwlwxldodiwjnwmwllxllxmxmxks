package g01;

import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.InteractionType;
import java.time.ZonedDateTime;
import k71.k;
import yz0.c5;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public InteractionType a;
    public String b;
    public Avatar c;
    public ZonedDateTime d;
    public com.github.service.models.response.a e;
    public c5 f;

    public c(InteractionType interactionType, String str, Avatar avatar, ZonedDateTime zonedDateTime, com.github.service.models.response.a aVar) {
        c5 c5Var;
        c5 c5Var2;
        k.g(interactionType, "type");
        this.a = interactionType;
        this.b = str;
        this.c = avatar;
        this.d = zonedDateTime;
        this.e = aVar;
        switch (b.a[interactionType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                c5Var = new c5(interactionType, aVar.x, aVar.y, null, 8);
                c5Var2 = c5Var;
                break;
            case 10:
            case 11:
                c5Var = new c5(interactionType, str == null ? "" : str, avatar, null, 8);
                c5Var2 = c5Var;
                break;
            default:
                c5Var2 = new c5(interactionType, aVar.x, aVar.y, null, 8);
                break;
        }
        this.f = c5Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && k.b(this.b, cVar.b) && k.b(this.c, cVar.c) && k.b(this.d, cVar.d) && k.b(this.e, cVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.e.hashCode() + m0.a(this.d, h1.j(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        return "Interaction(type=" + this.a + ", commenterLogin=" + this.b + ", commenterAvatar=" + this.c + ", occurredAt=" + this.d + ", author=" + this.e + ")";
    }
}
