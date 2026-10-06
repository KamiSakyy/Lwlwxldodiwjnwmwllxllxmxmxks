package com.github.service.models.response;

import android.os.Parcel;
import android.os.Parcelable;
import g81.e;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import sy.w;
import v8.l0;
import w61.h;
import w61.i;

@e
/* loaded from: /home/user/work/p/classes4.dex */
public final class Avatar implements Parcelable {
    public final String r;
    public final Type s;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<Avatar> CREATOR = new b();
    public static final h[] t = {null, w.s(i.r, new wm.a(21))};
    public static final Avatar u = new Avatar("", Type.User);

    public static final class Companion {
        public final KSerializer serializer() {
            return Avatar$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        private static final /* synthetic */ d71.a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type User = new Type("User", 0);
        public static final Type Organization = new Type("Organization", 1);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{User, Organization};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = l0.t($values);
        }

        private Type(String str, int i) {
        }

        public static d71.a getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public /* synthetic */ Avatar(int i, String str, Type type) {
        if (3 != (i & 3)) {
            c1.l(i, 3, Avatar$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.r = str;
        this.s = type;
    }

    public static Avatar c(Avatar avatar, String str) {
        Type type = avatar.s;
        avatar.getClass();
        k.g(str, "url");
        k.g(type, "type");
        return new Avatar(str, type);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Avatar)) {
            return false;
        }
        Avatar avatar = (Avatar) obj;
        return k.b(this.r, avatar.r) && this.s == avatar.s;
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String toString() {
        return "Avatar(url=" + this.r + ", type=" + this.s + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s.name());
    }

    public Avatar(String str, Type type) {
        k.g(str, "url");
        k.g(type, "type");
        this.r = str;
        this.s = type;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
    
        if (r3.equals("Organization") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if (r3.equals("EnterpriseUserAccount") != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        r3 = com.github.service.models.response.Avatar.Type.User;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r3.equals("User") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (r3.equals("Bot") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r3.equals("Mannequin") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003a, code lost:
    
        r3 = com.github.service.models.response.Avatar.Type.Organization;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Avatar(String str, String str2) {
        this(str, r3);
        Type type;
        switch (str2.hashCode()) {
            case 66983:
                break;
            case 2645995:
                break;
            case 668662177:
                break;
            case 1343242579:
                break;
            case 1900959290:
                break;
            default:
                type = Type.User;
                break;
        }
    }

    public <T0> T0 q(Object... a) {
        return null;
    }
}
