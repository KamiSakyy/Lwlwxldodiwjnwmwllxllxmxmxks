package i91;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* loaded from: /home/user/work/p/classes5.dex */
public final class i extends h91.d {
    public Socket n;

    public i(Socket socket) {
        this.n = socket;
    }

    @Override // h91.d
    public final IOException k(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // h91.d
    public final void l() {
        Socket socket = this.n;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!l.a(e)) {
                throw e;
            }
            l.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            l.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }
}
