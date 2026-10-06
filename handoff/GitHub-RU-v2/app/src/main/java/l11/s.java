package l11;

import java.util.Arrays;

/* loaded from: /home/user/work/p/classes4.dex */
public class s extends e0 {
    public long a;
    public Integer b;
    public a0 c;
    public long d;
    public byte[] e;
    public String f;
    public long g;
    public i0 h;
    public b0 i;

    public s(long j, Integer num, a0 a0Var, long j2, byte[] bArr, String str, long j3, i0 i0Var, b0 b0Var) {
        this.a = j;
        this.b = num;
        this.c = a0Var;
        this.d = j2;
        this.e = bArr;
        this.f = str;
        this.g = j3;
        this.h = i0Var;
        this.i = b0Var;
    }

    public final boolean equals(Object obj) {
        Integer num;
        a0 a0Var;
        String str;
        i0 i0Var;
        b0 b0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            s sVar = (s) e0Var;
            b0 b0Var2 = sVar.i;
            i0 i0Var2 = sVar.h;
            String str2 = sVar.f;
            a0 a0Var2 = sVar.c;
            Integer num2 = sVar.b;
            if (this.a == sVar.a && ((num = this.b) != null ? num.equals(num2) : num2 == null) && ((a0Var = this.c) != null ? a0Var.equals(a0Var2) : a0Var2 == null) && this.d == sVar.d) {
                if (Arrays.equals(this.e, e0Var instanceof s ? ((s) e0Var).e : sVar.e) && ((str = this.f) != null ? str.equals(str2) : str2 == null) && this.g == sVar.g && ((i0Var = this.h) != null ? i0Var.equals(i0Var2) : i0Var2 == null) && ((b0Var = this.i) != null ? b0Var.equals(b0Var2) : b0Var2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        a0 a0Var = this.c;
        int hashCode2 = (hashCode ^ (a0Var == null ? 0 : a0Var.hashCode())) * 1000003;
        long j2 = this.d;
        int hashCode3 = (((hashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.e)) * 1000003;
        String str = this.f;
        int hashCode4 = (hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.g;
        int i2 = (hashCode4 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        i0 i0Var = this.h;
        int hashCode5 = (i2 ^ (i0Var == null ? 0 : i0Var.hashCode())) * 1000003;
        b0 b0Var = this.i;
        return hashCode5 ^ (b0Var != null ? b0Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", complianceData=" + this.c + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(this.e) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.g + ", networkConnectionInfo=" + this.h + ", experimentIds=" + this.i + "}";
    }
}
