package com.github.service.dotcom.models.response.copilot;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import g81.e;
import gz.a;
import k71.k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.c;
import sy.w;
import w61.h;
import w61.i;
import xn.j3;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class EventResponse {
    public static final Companion Companion = new Companion();
    public static final h[] i = {null, null, null, null, w.s(i.r, new a(16)), null, null, null};
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final j3 e;
    public final c f;
    public final Boolean g;
    public final Boolean h;

    public static final class Companion {
        public final KSerializer serializer() {
            return EventResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EventResponse(int i2, String str, String str2, String str3, boolean z, j3 j3Var, c cVar, Boolean bool, Boolean bool2) {
        if ((i2 & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i2 & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i2 & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        if ((i2 & 16) == 0) {
            this.e = j3.K;
        } else {
            this.e = j3Var;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = cVar;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = bool2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventResponse)) {
            return false;
        }
        EventResponse eventResponse = (EventResponse) obj;
        return k.b(this.a, eventResponse.a) && k.b(this.b, eventResponse.b) && k.b(this.c, eventResponse.c) && this.d == eventResponse.d && this.e == eventResponse.e && k.b(this.f, eventResponse.f) && k.b(this.g, eventResponse.g) && k.b(this.h, eventResponse.h);
    }

    public final int hashCode() {
        int i2 = h1.i(this.a.hashCode() * 31, this.b, 31);
        String str = this.c;
        int hashCode = (this.e.hashCode() + x.i.e((i2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.d)) * 31;
        c cVar = this.f;
        int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.r.hashCode())) * 31;
        Boolean bool = this.g;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.h;
        return hashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = s0.o("EventResponse(id=", this.a, ", timestamp=", this.b, ", parentId=");
        m0.x(o, this.c, ", ephemeral=", this.d, ", type=");
        o.append(this.e);
        o.append(", data=");
        o.append(this.f);
        o.append(", dismissed=");
        o.append(this.g);
        o.append(", pending=");
        o.append(this.h);
        o.append(")");
        return o.toString();
    }
}
