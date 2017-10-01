package queue;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class QueueItem {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long position;
    private long patientId;
}
