package org.coode.owlviz.util.graph.factory;

import org.coode.owlviz.util.graph.graph.Node;

/**
 * User: matthewhorridge
 * The Univeristy Of Manchester
 * Medical Informatics Group
 * Date: Dec 27, 2003<br>
 * <p/>
 * matthew.horridge@cs.man.ac.uk
 * www.cs.man.ac.uk/~horridgm<br>
 * <p/>
 * Defines the interface required of any <code>NodeFactory</code>
 */
public interface NodeFactory {

    /**
     * Creates a node
     *
     * @param userObject Specifies the user object that the <code>Node</code>
     *                   is associated with.  May be <code>null</code
     * @return The newly created node.
     */
    public Node createNode(Object userObject);
}
