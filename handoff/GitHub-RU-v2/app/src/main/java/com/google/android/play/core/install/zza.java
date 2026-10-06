package com.google.android.play.core.install;

import com.github.rudroid.m0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zza {
    public int a;
    public long b;
    public long c;
    public int d;
    public String e;

    public zza(int i, long j, long j2, int i2, String str) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = i2;
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zza) {
            zza zzaVar = (zza) obj;
            if (this.a == zzaVar.a && this.b == zzaVar.b && this.c == zzaVar.c && this.d == zzaVar.d && this.e.equals(zzaVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a ^ 1000003;
        long j = this.b;
        long j2 = this.c;
        return (((((((i * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallState{installStatus=");
        sb.append(this.a);
        sb.append(", bytesDownloaded=");
        sb.append(this.b);
        sb.append(", totalBytesToDownload=");
        sb.append(this.c);
        sb.append(", installErrorCode=");
        return m0.c(this.d, ", packageName=", this.e, "}", sb);
    }
}
