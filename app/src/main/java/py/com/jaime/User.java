package py.com.jaime;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class User   implements Parcelable {
    private String firstname;
    private String apellido;
    private String email;
    private int numeroTel;

    public User(String firstname, String apellido, String email, int numeroTel) {
        this.firstname = firstname;
        this.apellido = apellido;
        this.email = email;
        this.numeroTel = numeroTel;
    }

    protected User(Parcel in) {
        firstname = in.readString();
        apellido = in.readString();
        email = in.readString();
        numeroTel = in.readInt();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(int numeroTel) {
        this.numeroTel = numeroTel;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(firstname);
        parcel.writeString(apellido);
        parcel.writeString(email);
        parcel.writeInt(numeroTel);
    }
}
