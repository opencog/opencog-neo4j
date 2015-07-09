package org.opencog.atomspace;

import java.io.Serializable;

/**
 * Represents an <a href="http://wiki.opencog.org/w/Atom">Atom</a> in the {@link AtomSpace}.
 * Inspired by <a href="https://github.com/opencog/atomspace/blob/master/opencog/atomspace/Atom.h">opencog/atomspace/Atom.h</a>.
 * @see Node
 * @see Link
 */
public class Atom implements Serializable {

    private AtomType type;

    public Atom(AtomType type) {
        this.type = type;
    }

    public AtomType getType() {
        return type;
    }

}