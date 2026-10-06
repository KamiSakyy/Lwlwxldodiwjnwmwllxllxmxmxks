package m11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i {
    public String a;
    public Integer b;
    public m c;
    public long d;
    public long e;
    public Map f;
    public Integer g;
    public String h;
    public byte[] i;
    public byte[] j;

    public i(String str, Integer num, m mVar, long j, long j2, HashMap hashMap, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.a = str;
        this.b = num;
        this.c = mVar;
        this.d = j;
        this.e = j2;
        this.f = hashMap;
        this.g = num2;
        this.h = str2;
        this.i = bArr;
        this.j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final h c() {
        h hVar = new h();
        String str = this.a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        hVar.b = str;
        hVar.d = this.b;
        hVar.e = this.g;
        hVar.c = this.h;
        hVar.j = this.i;
        hVar.k = this.j;
        m mVar = this.c;
        if (mVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        hVar.f = mVar;
        hVar.g = Long.valueOf(this.d);
        hVar.h = Long.valueOf(this.e);
        hVar.i = new HashMap(this.f);
        return hVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            String str2 = iVar.h;
            Integer num3 = iVar.g;
            Integer num4 = iVar.b;
            if (this.a.equals(iVar.a) && ((num = this.b) != null ? num.equals(num4) : num4 == null) && this.c.equals(iVar.c) && this.d == iVar.d && this.e == iVar.e && this.f.equals(iVar.f) && ((num2 = this.g) != null ? num2.equals(num3) : num3 == null) && ((str = this.h) != null ? str.equals(str2) : str2 == null) && Arrays.equals(this.i, iVar.i) && Arrays.equals(this.j, iVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (hashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        int hashCode3 = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode()) * 1000003;
        Integer num2 = this.g;
        int hashCode4 = (hashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.h;
        return ((((hashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.i)) * 1000003) ^ Arrays.hashCode(this.j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + ", productId=" + this.g + ", pseudonymousId=" + this.h + ", experimentIdsClear=" + Arrays.toString(this.i) + ", experimentIdsEncrypted=" + Arrays.toString(this.j) + "}";
    }
}
