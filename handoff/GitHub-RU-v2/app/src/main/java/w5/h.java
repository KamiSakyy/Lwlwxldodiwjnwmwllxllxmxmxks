package w5;

import android.system.Os;
import java.io.FileDescriptor;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class h {
    public static void a(FileDescriptor fileDescriptor) {
        Os.close(fileDescriptor);
    }

    public static FileDescriptor b(FileDescriptor fileDescriptor) {
        return Os.dup(fileDescriptor);
    }

    public static long c(FileDescriptor fileDescriptor, long j10, int i) {
        return Os.lseek(fileDescriptor, j10, i);
    }
}
