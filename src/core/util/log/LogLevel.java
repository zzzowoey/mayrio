/*
 * This file is part of mayrio.
 *
 * mayrio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mayrio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mayrio.  If not, see <https://www.gnu.org/licenses/>.
 */

package core.util.log;

/**
 * Log level enumerator for MayrioLogger.
 * The MayrioLogger follows a hierarchical system much like most mainstream logging libraries.
 * <p>
 * The levels, from finest to coarsest, are as follows:
 * ALL > DEBUG > INFO > WARN > ERROR > FATAL > NONE
 */
public enum LogLevel {
    ALL, DEBUG, INFO, WARN, ERROR, FATAL, NONE;

    public String getAbbreviation() {
        return this.name().substring(0, 1);
    }
}
